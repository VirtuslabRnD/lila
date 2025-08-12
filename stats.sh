#!/usr/bin/env bash

echo "Modules:                 $(find modules -type d -depth 1 | wc -l)"
echo "Main sources in modules: $(find modules -type d -name main -exec find {} -type f -name '*.scala' \; | wc -l)"
echo "Test sources in modules: $(find modules -type d -name test -exec find {} -type f -name '*.scala' \; | wc -l)"
echo "Main LOC in modules:     $(find modules -type d -name main -exec find {} -type f -name '*.scala' -print0 \; | xargs -0 cat | wc -l)"
echo "Test LOC in modules:     $(find modules -type d -name test -exec find {} -type f -name '*.scala' -print0 \; | xargs -0 cat | wc -l)"
echo "App sources:             $(find app -type f | wc -l)"
echo "App LOC:                 $(find app -type f -print0 | xargs -0 cat | wc -l)"

echo "BUILD files              $(find . -type f -name 'BUILD' | wc -l)"
echo "BUILD LOC:               $(find . -type f -name 'BUILD' -print0 | xargs -0 cat | wc -l)"
