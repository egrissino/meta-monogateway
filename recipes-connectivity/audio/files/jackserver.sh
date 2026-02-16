#!/bin/bash


jackd -R -d alsa -d hw:0,0 -p 128 -X net &
sleep 5

jack_load netmanager

sleep 5

HOST=audiohost

isHostConnected () {
    jack_lsp | grep -q "^${HOST}"
}

sleep 10

while ! (isHostConnected); do
    sleep 1
done

source ./jackconnect.sh