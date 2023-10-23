#!/bin/bash

mkdir -p /data/$HOSTNAME

sleep 10;

gfsh start server --name=$HOSTNAME --locators=locator[10334] --dir=/data/$HOSTNAME/ "$@"

while true; do
    sleep 10
  done