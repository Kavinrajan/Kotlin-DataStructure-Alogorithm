package sorts

/**
 *  Algorithm:
 *
 *  Step 1 − Start
 *  Step 2 − Initialize the value of gap size. Example: h
 *  Step 3 − Divide the list into smaller sub-part. Each must have equal intervals to h
 *  Step 4 − Sort these sub-lists using insertion sort
 *  Step 5 – Repeat this step 2 until the list is sorted.
 *  Step 6 – Print a sorted list.
 *  Step 7 – Stop.
* */

class ShellSortTest: AbstractSortTest<ShellSort>(ShellSort())
