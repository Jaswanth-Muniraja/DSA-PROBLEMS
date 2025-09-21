package BinarySearchOnAnswers;

public class bookAllocationProblem {
     public static int findPages(int[] pages, int students) {
        if(pages.length < students) return -1;
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int page : pages){
            low = Math.max(low,page);
            high += page;
        }
        while(low <= high){
            int mid = low + (high - low)/2;
            int noOfStudents = noOfStudents(pages,mid);
            if( noOfStudents > students){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }
    public static int noOfStudents(int[] pages, int maxPages){
        int n = pages.length;
        int students = 1;
        int pagesStudentHold = 0;
        for(int i=0; i<n; i++){
            if(pagesStudentHold + pages[i] <= maxPages){
                pagesStudentHold += pages[i];
            }else{
                students ++;
                pagesStudentHold = pages[i];
            }
        }
        return students;
    }

    public static void main(String[] args){
        int[] pages = {12, 34, 67, 90};
        int students = 2;
        // Divide pages into 2(how many students) parts, so that the 2 parts have the minimum maximum pages
        // => [12] and [34, 67, 90] Maximum Pages = 191
        // => [12, 34] and [67, 90] Maximum Pages = 157
        // => [12, 34, 67] and [90] Maximum Pages = 113.
        // The third combination has the minimum pages assigned to a student which is 113.

        int minMaxPages = findPages(pages, students);
        System.out.println(minMaxPages);
    }
}
