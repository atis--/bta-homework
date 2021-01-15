#!/usr/bin/env groovy

class FrequencyCounterTest extends GroovyTestCase {

    void testOutput() {
        FrequencyCounter fc = new FrequencyCounter()
        fc.processText('aaa (╯°□°）╯︵ ┻━┻) BcdeF zZzZzZzZžŽ')

        assertEquals fc.toString(), '''
A: 3
B: 1
C: 1
D: 1
E: 1
F: 1
G: 0
H: 0
I: 0
J: 0
K: 0
L: 0
M: 0
N: 0
O: 0
P: 0
Q: 0
R: 0
S: 0
T: 0
U: 0
V: 0
W: 0
X: 0
Y: 0
Z: 8'''.trim()
    }

}