/*
 * Copyright 1999-2004 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.collections;

import java.util.NoSuchElementException;

/**
 * A thread safe version of the PriorityQueue.
 * Provides synchronized wrapper methods for all the methods 
 * defined in the PriorityQueue interface.
 *
 * @since 1.0
 * @author  <a href="mailto:ram.chidambaram@telus.com">Ram Chidambaram</a> 
 */
public final class SynchronizedPriorityQueue 
    implements PriorityQueue
{

    /**
     *  The underlying priority queue.
     */
    protected final PriorityQueue   m_priorityQueue;


    /**
     *  Constructs a new synchronized priority queue.
     *
     *  @param priorityQueue the priority queue to synchronize
     */
    public SynchronizedPriorityQueue( final PriorityQueue priorityQueue )
    {
        m_priorityQueue = priorityQueue;
    }

    /**
     * Clear all elements from queue.
     */
    public synchronized void clear()
    {
        m_priorityQueue.clear();
    }

    /**
     * Test if queue is empty.
     *
     * @return true if queue is empty else false.
     */
    public synchronized boolean isEmpty()
    {
        return m_priorityQueue.isEmpty();
    }

    /**
     * Insert an element into queue.
     *
     * @param element the element to be inserted
     */
    public synchronized void insert( final Object element )
    {
        m_priorityQueue.insert( element );
    }

    /**
     * Return element on top of heap but don't remove it.
     *
     * @return the element at top of heap
     * @exception NoSuchElementException if isEmpty() == true
     */
    public synchronized Object peek() throws NoSuchElementException
    {
        return m_priorityQueue.peek();
    }

    /**
     * Return element on top of heap and remove it.
     *
     * @return the element at top of heap
     * @exception NoSuchElementException if isEmpty() == true
     */
    public synchronized Object pop() throws NoSuchElementException
    {
        return m_priorityQueue.pop();
    }

    /**
     *  Returns a string representation of the underlying queue.
     *
     *  @return a string representation of the underlying queue
     */
    public synchronized String toString()
    {
        return m_priorityQueue.toString();
    }
}
