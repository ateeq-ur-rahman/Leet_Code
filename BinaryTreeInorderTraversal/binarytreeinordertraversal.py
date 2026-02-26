"""
if root==None:
return []
else:
return self.inorderTraversal(root.left)+[root.val]+self.inorderTraversal(root.right)

"""