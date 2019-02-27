# Generador de ficheros .gitignore

# Crea un fichero .gitignore en la carpeta principal y en cada
# proyecto de IntelliJ que encuentre en los subdirectorios
#
# - Usa gibo (https://github.com/simonwhitaker/gibo) para descargar las
#   plantillas desde GitHub
# - Solo mira en el primer nivel de directorios
# - No modifica los ficheros que ya existan
# - Prerequisitos: git (https://git-scm.com/downloads)
#
# Convertido a PowerShell desde la versión original en bash 
# por Javi (https://github.com/javiermdg99)  

$path=".gitignore"
$idea=".idea"

./gibo/gibo.bat update >$null 2>&1

if(![System.IO.File]::Exists($path)) {
    ./gibo/gibo.bat dump windows linux macos > .gitignore
}

Foreach($i in Get-ChildItem (Get-Location)) {
    if(Test-Path -Path $i.fullname -PathType Container) {      
        Foreach($d in Get-ChildItem($i.fullname)) {
            if(Test-Path -Path $d.fullname -PathType Container) {              
                if(Test-Path -Path  "$($d.fullname)\$idea") {
                    $fullname="$($d.fullname)/$path"                       
                    if(![System.IO.File]::Exists($fullname)) {
                        ./gibo/gibo.bat dump java jetbrains > "$fullname"
                    }
                }
            }
        }
    }
}
