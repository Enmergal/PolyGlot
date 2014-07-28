/*
 * Copyright (c) 2014, draque
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 * * This source code may not be included in any commercial or for profit 
 *  software without the express written and signed consent of the copyright
 *  holder.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package PolyGlot;

/**
 * Used to rank any given object by numeric value. WHY ISN'T THIS IN JAVA 
 * BY DEFAULT???
 * @author draque
 */
public class RankedObject implements Comparable<RankedObject>{
    private final int rank;
    private int LOWER = -1;
    private int HIGHER = 1;
    Object holder;
    
    RankedObject(Object _holder, int _rank) {
        holder = _holder;        
        rank = _rank;
    }
    
    public int getRank() {
        return rank;
    }
    
    public Object getHolder() {
        return holder;
    }
    
    public void setDescending(boolean descending) {
        if (descending) {
            LOWER = 1;
            HIGHER = -1;
        } else {
            LOWER = -1;
            HIGHER = 1;
        }
    }
    
    // does not handle equal values. Returning 0 would merge, and this is undesirable.
    @Override
    public int compareTo(RankedObject _compare) {        
        if (_compare.getRank() > this.getRank()) {
            return LOWER;
        }
        else {
            return HIGHER;
        }    
    }
}