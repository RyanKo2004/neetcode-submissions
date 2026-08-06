class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hash_map = {}

        for i,num in enumerate(nums):
            remainder = target - num
            if remainder in hash_map:
                return [hash_map[remainder],i]

            hash_map[num] = i

            

        


        
            
