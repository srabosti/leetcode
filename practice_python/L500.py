class Solution(object):
    def findWords(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        return filter(re.compile('(?i)([ASDFGHJKL]*|[ZXCVBNM]*|[QWERTYUIOP]*)$').match, words)
        