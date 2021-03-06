/*
 *  The MIT License (MIT)
 *
 *  Copyright (c) 2017 Flipkart Internet Pvt. Ltd.
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */

package com.flipkart.batching.core.data;


import com.flipkart.batching.core.Batch;
import com.flipkart.batching.core.BatchImpl;
import com.flipkart.batching.core.Data;
import com.flipkart.batching.core.Utils;

import junit.framework.Assert;

import org.junit.Test;

import java.util.ArrayList;

public class BatchTest {

    /**
     * Test to verify the {@link Batch#getDataCollection()} method.
     */
    @Test
    public void testBatch() {
        ArrayList<Data> dataArrayList = Utils.fakeCollection(4);
        Batch<Data> batch = new BatchImpl<>(dataArrayList);
        Assert.assertEquals(batch.getDataCollection(), dataArrayList);
    }

    /**
     * Test to verify that {@link Batch#equals(Object)} method.
     */
    @Test
    public void testBatchEquals() {
        ArrayList<Data> arrayList = Utils.fakeCollection(4);
        ArrayList<Data> arrayList1 = Utils.fakeCollection(5);
        Batch<Data> batch = new BatchImpl<>(arrayList);
        Batch<Data> batch1 = new BatchImpl<>(arrayList1);
        Assert.assertTrue(!batch.equals(batch1));
    }
}
