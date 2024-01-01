#!/bin/bash

cat $1 | java -cp "./out/":"Libs/*" tw.exact.MainDecomposer
