class Solution:
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        res=""
        for tmp in zip(*strs):
            '''
            通过zip获取元组
            ('f', 'f', 'f')
            ('l', 'l', 'l')
            ('o', 'o', 'i')
            ('w', 'w', 'g')
            '''
            print(tmp)
            #去重
            tmp_set=set(tmp)
            print(type(tmp_set))#<class 'set'>
            if len(tmp_set)==1:
                res+=tmp[0]
            else:
                break
        return res
soulution=Solution()
print(soulution.longestCommonPrefix(["flower","flow","flight"]))


