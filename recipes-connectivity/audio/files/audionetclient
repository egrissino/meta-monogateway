#!/bin/bash

jackd -R -d dummy -p 128 &

sleep 5

jack_load -i "-n "audiohost" -H sdk" netadapter

