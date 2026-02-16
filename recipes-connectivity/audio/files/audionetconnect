#!/bin/bash

if [[ -z ${HOST} ]]; then
    host=audiohost
else
    host=$HOST    
fi

jack_connect system:capture_1 ${host}:to_slave_1
jack_connect system:capture_2 ${host}:to_slave_2
jack_connect system:playback_1 ${host}:from_slave_1
jack_connect system:playback_2 ${host}:from_slave_2


