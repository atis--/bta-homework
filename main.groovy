#!/usr/bin/env groovy

FrequencyCounter fc = new FrequencyCounter()

// read text from file and analyze it
String text = new File('./bta-news.txt').getText('UTF-8')
fc.processText(text)

// print character counts to stdout
println fc
