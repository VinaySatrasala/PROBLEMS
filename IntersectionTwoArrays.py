def intersection(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        nums1=set(nums1)
        nums2=set(nums2)
        return nums1.intersection(nums2)

n1={1,2,3}
n2={2,3}
print(n1.intersection(n2))