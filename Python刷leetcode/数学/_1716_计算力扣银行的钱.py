class Solution:
    def totalMoney(self, n: int) -> int:
        num=1
        sum=0
        for i in range(1,n+1):
            sum+=num
            if i%7==0:
                num=i/7
            num+=1
        return int(sum)