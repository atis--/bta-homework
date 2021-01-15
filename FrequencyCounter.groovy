
/**
 * Class for counting letters and converting the result to a string representation.
 */
class FrequencyCounter {
    /** uppercase letter -> integer counter */
    private Map<String,Integer> charCounts = [:]

    /**
     * Counts English letters in given text and updates the internal frequency counters.
     *
     * @param txt The text whose characters must be counted.
     */
    void processText(String txt) {
        txt.each { c ->
            c = c.toUpperCase()
            if (c ==~ /[A-Z]/) {
                if (charCounts.containsKey(c)) {
                    charCounts[c] += 1
                } else {
                    charCounts[c] = 1
                }
            }
        }
    }

    String toString() {
        String result = ''
        for (Integer charCode in 65..90) {
            String c = Character.toString(charCode as char)
            Integer count = charCounts[c]
            if (count == null) {
                count = 0
            }
            result += "$c: $count"
            if (charCode != 90) {
                result += "\n"
            }
        }
        return result
    }
}