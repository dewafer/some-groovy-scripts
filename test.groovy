#!/usr/bin/env groovy

import static System.exit

println "hello:${args}"

if (!args) {
    println """
  Need args...
"""
    exit 1
}

println "Yes! ${args}"
