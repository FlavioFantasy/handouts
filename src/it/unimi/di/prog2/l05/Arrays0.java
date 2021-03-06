/*

Copyright 2019 Massimo Santini

This file is part of "Programmazione 2 @ UniMI" teaching material.

This is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This material is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this file.  If not, see <https://www.gnu.org/licenses/>.

*/

package it.unimi.di.prog2.l05;

/**
 * This class provides a number of standalone procedures that are useful for manipulating arrays of
 * ints.
 *
 * <p>This version contains just the contracts of Figure 3.4.
 */
public class Arrays0 {

  /**
   * Searches for an element in an array.
   *
   * @param a the array of elements to be searched.
   * @param x the element to search in <code>a</code>.
   * @return an index where <code>x</code> is stored <code>x</code> is in <code>a</code>, otherwise
   *     returns -1.
   */
  public static int search(int[] a, int x) {
    return -1;
  }

  /**
   * Searches for an element in a sorted array.
   *
   * @param a the array of elements to be searched, sorted in ascending order.
   * @param x the element to search in <code>a</code>.
   * @return an index where <code>x</code> is stored <code>x</code> is in <code>a</code>, otherwise
   *     returns -1.
   */
  public static int searchSorted(int[] a, int x) {
    return -1;
  }

  /**
   * Sorts the given array.
   *
   * <p>Rearranges the elements of <code>a</code> into ascending order; e.g., if <code>
   * a = [3, 1, 6, 1]</code> before the call, on return <code>a = [1, 1,
   * 3, 6]</code>.
   *
   * @param a the array of elements to be sorted; it will be modified inplace.
   */
  public static void sort(int[] a) {}

  /**
   * Returns a new array containing a "bounded" copy of the given array.
   *
   * @param a the array of elements to be bounded.
   * @param n the threshold value.
   * @return a new array containing the elements of <code>a</code> in the order they appear in a
   *     except that any elements of a that are greater than <code>n</code> are replaced by <code>n
   *     </code>.
   */
  public static int[] boundArray(int[] a, int n) {
    return null;
  }
}
