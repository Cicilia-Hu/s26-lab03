package edu.cmu.cs.cs214.rec04;


/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList {
    // Write your implementation below with API documentation

    /**
     * count of the number of attempted element insertions
     */ 
    private int totalAdded = 0;
    
    /**
     * return the number of attempted insertions
     */ 
    public int getTotalAdded() {
        return totalAdded;
    }

    /**
     * Adds one element to the list
     * increment the totalAdded
     * return true if the list is changed as a result of the call
     */
    @Override
    public boolean add(int num) {
        totalAdded += 1;
        return super.add(num);
    }

    /**
     * Adds all elements of list into this list
     * return true if the list changed as a result of the call
     */
    @Override
    public boolean addAll(IntegerList list) {
        return super.addAll(list);
    }


}