#!/usr/bin/env groovy

def sites = [
    'http://www.baidu.com',
    'https://www.zimuzu.tv',
    'https://google.com',
    '127.0.0.1',
    'www.groovy-lang.org'
]

def rand = new Random()

def curlSite = sites[rand.nextInt(sites.size())]

println "curl site: ${curlSite}"

def process = "curl -L ${curlSite}".execute()

def result = process.in.getText()
println "Result: \n${result}"

def errorResult = process.err.getText()

if (errorResult) {
    println "Error: \n${errorResult}"
}