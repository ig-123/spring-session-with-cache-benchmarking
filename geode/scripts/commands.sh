#!/bin/sh

sleep 40
gfsh <<EOF
connect --locator=locator[10334] --jmx-manager=locator[1099]
create region --name=ClusteredSpringSessions --type=REPLICATE
EOF
