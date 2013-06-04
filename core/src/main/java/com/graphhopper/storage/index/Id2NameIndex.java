/*
 * Copyright 2013 Thomas Buerli <tbuerli@student.ethz.ch>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.graphhopper.storage.index;

import java.util.HashMap;

/**
 *
 * @author Thomas Buerli <tbuerli@student.ethz.ch>
 */
public class Id2NameIndex {
    
    private HashMap<Integer,String> index;

    public Id2NameIndex() {
        index = new HashMap<Integer, String>();
    }
    
    public String findName(int id){
        return index.get(id);
    }

    public boolean isEmpty() {
        return index.isEmpty();
    }
    
    public void addName(int id, String name){
        index.put(id, name);
    }
    
}
