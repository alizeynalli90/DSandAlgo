package az.alizeynalli.leetcodeproblems;

import az.alizeynalli.dt.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/sort-list/
public class LL_Sort {
    public ListNode sortList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        int size = list.size();
        Integer tempArray[] = list.toArray(new Integer[size]);

        int array[] = new int[tempArray.length];
        for(int i= 0; i<tempArray.length;i++){
            array[i]=tempArray[i].intValue();
        }
        sort(array);
        ListNode tempNode = new ListNode(array[0]);
        ListNode result = tempNode;
        for(int i=1;i<array.length;i++){
            tempNode.next = new ListNode(array[i]);
            tempNode = tempNode.next;

        }
        return result;
    }

    private void sort(int[] array){
        mergeSort(array, array.length);
    }

    private void mergeSort(int[] array, int length){
        if(length<2){
            return;
        }
        int middle = length/2;
        int left[] = new int[middle];
        int rigth[] = new int[length-middle];
        for(int i = 0;i<middle;i++ ){
            left[i]=array[i];
        }
        for(int i = middle;i<array.length;i++ ){
            rigth[i-middle]=array[i];
        }
        mergeSort(left, middle);
        mergeSort(rigth, length-middle);

        merge(array, left, rigth, middle, length-middle);
    }

    private void merge(int[] array, int[] leftArray, int[] rigthArray, int left, int rigth){
        int i= 0;
        int j=0;
        int k=0;
        while(i<left&&j<rigth){
            if(leftArray[i]<=rigthArray[j]){
                array[k++] = leftArray[i++];
            }else{
                array[k++] = rigthArray[j++];
            }
        }
        while(i<left){
            array[k++] = leftArray[i++];
        }
        while(j<rigth){
            array[k++] = rigthArray[j++];
        }
    }
}
