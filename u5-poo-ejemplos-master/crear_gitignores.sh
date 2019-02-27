#!/bin/bash

# Generador de ficheros .gitignore

# Crea un fichero .gitignore en la carpeta principal y en cada
# proyecto de IntelliJ que encuentre en los subdirectorios
#
# - Usa gibo (https://github.com/simonwhitaker/gibo) para descargar las
#   plantillas desde GitHub
# - Solo mira en el primer nivel de directorios
# - No modifica los ficheros que ya existan
# - Prerequisitos: git (https://git-scm.com/downloads)

./gibo/gibo update > /dev/null 2>&1

if [ ! -e .gitignore ]; then
    ./gibo/gibo dump windows linux macos > .gitignore
fi

for d in ./*; do
    if [ -d "$d" ]; then
        for p in "$d"/*; do
            if [ -d "$p" ] && [ -e "$p"/.idea ]; then
                if [ ! -e "$p"/.gitignore ]; then
                    ./gibo/gibo dump java jetbrains > "$p"/.gitignore
                fi
            fi
        done
    fi
done
