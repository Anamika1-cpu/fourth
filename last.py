# Last Index of number using recursion
def index(a,k,i,ind):
     if i==len(a):
         return ind
     if a[i]==k:
         ind=i
           
     return index(a,k,i+1,ind)
a=[5,1,6,2,3,6,78,4,55,6]
print(index(a,6,0,-1))
