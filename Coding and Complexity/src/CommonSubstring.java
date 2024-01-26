//public class CommonSubstring


        /*Idea for how to implement CommonSubstring:
        *
        * Similar to CommonSubsequence, break the two inputs up into two String arrays
        * Iterate through the first and second arrays to see if they have matching characters.
        * But, instead of automatically adding the common characters, have an if-statement to
        * check if the indexes of the similar characters is more than 1 apart
        * If the indexes are more than 1 apart for either array, that means the characters are
        * not next to each other in the original string and therefore are not substrings
        * Only add to common string if they are 1 index apart
        *
        *
        * */
