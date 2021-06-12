class Array {
    public int lengthofSubArray(int[] arr) {
        int n = arr.length, l = 0, r = n - 1;
        while(l < r - 1) {
            int mid = l + (r - l) / 2;
            if(check(arr, mid)) {
                r = mid;
            }
            else {
                l = mid + 1;
            }
        }
        if(check(arr, l)) {
            return l;
        }
        return r;
    }
    
    private boolean check(int[] a, int k) {
        int cnt1 = 0, cnt2 = 0, n = a.length, prev = Integer.MAX_VALUE;
        for(int i = a.length - 1; i >= k; i--) {
            if(a[i] <= prev) {
                cnt2++;
                prev = a[i];
            }
            else {
                break;
            }
        }
        if(cnt2 == n - k) {
            return true;
        }
        prev = -1;
        //loop for window's start index
        for(int i = 0; i <= n - k; i++) {
            if(cnt1 == n - k) {
                return true;
            }
            if(cnt1 + cnt2 >= n - k) {
                if(k + cnt1 >= n - cnt2 && a[cnt1 - 1] <= a[k + cnt1]) {
                    return true;
                }             
            }            
            if(prev > a[i]) {
                break;
            }
            prev = a[i];
            cnt1++;
        }
        return false;
    }
}
public class Challenge1
{

	public static void main(String[] args) {
		Array arr = new Array();
		int ar [] ={1,2,3,10,4,2,3,5};
		System.out.println(arr.lengthofSubArray(ar));
		int ar1 [] ={5,4,3,2,1};
		System.out.println(arr.lengthofSubArray(ar1));
		int ar2 [] ={1,2,3};
		System.out.println(arr.lengthofSubArray(ar2));
		int ar3 [] ={1};
		System.out.println(arr.lengthofSubArray(ar3));
	}

}