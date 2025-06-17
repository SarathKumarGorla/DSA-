class Solution:
    def reverseWords(self, s: str) -> str:
        w=""
        ns=""
        for j in range(len(s)-1,-1,-1):
            if s[j]!=" ":
                w=w+s[j]
            elif len(w)>0 and s[j]==" ":
                    ns=ns+w[::-1]+" "
                    w=""
        if len(w)>0:
            ns=ns+w[::-1]
        ns=ns.strip(" ")
        return ns
        