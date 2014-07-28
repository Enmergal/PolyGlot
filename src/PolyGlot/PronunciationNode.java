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

// TODO: sometimes the last populated pronunciation will not fire off in autopopulate
// figure out why that is and correct it.
package PolyGlot;

/**
 *
 * @author draque
 */
public class PronunciationNode extends DictNode{
    private String pronunciation = "";
    
    public String getPronunciation() {
        return pronunciation;
    }
    
    public void setPronunciation(String _pronunciation) {
        pronunciation = _pronunciation;
    }
    
    public boolean equals(PronunciationNode test) {
        boolean ret = true;
        
        ret = ret & (id.equals(test.getId()));
        
        ret = ret & (value != null && test.getValue() != null && value.equals(test.getValue()));
        
        ret = ret & (pronunciation != null && test.getPronunciation() != null && pronunciation.equals(test.getPronunciation()));
        
        return ret;
    }

    @Override
    public void setEqual(DictNode _node) {
        PronunciationNode node = (PronunciationNode) _node;
        
        this.setPronunciation(node.getPronunciation());
        this.setValue(node.getValue());
        this.setId(node.getId());
    }
}