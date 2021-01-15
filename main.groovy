#!/usr/bin/env groovy

FrequencyCounter fc = new FrequencyCounter()

// read text from file and analyize it
String text = new File('./bta-news.txt').getText('UTF-8')
fc.processText(text)

println fc
