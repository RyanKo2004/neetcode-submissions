class Solution:

    def encode(self, strs: List[str]) -> str:
        parts = []
        for s in strs:
            parts.append(s)
            parts.append("~")
        
        return "".join(parts)

    def decode(self, s: str) -> List[str]:
        listy = []
        current = ""
        for c in s:
            if c == "~":
                listy.append(current)
                current = ""
            else:
                current += c

        return listy

            

