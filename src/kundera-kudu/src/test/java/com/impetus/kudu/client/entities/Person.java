/*******************************************************************************
 *  * Copyright 2015 Impetus Infotech.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 ******************************************************************************/
package com.impetus.kudu.client.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.impetus.kundera.index.Index;
import com.impetus.kundera.index.IndexCollection;

/**
 * The Class Person.
 * 
 * @author: karthikp.manchala
 */
@Entity
@Table(name = "Person")
@IndexCollection(columns = { @Index(name = "personName"), @Index(name = "age"), @Index(name = "salary") })
public class Person implements Serializable
{

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The person id. */
    @Id
    private String personId;

    /** The person name. */
    private String personName;

    /** The age. */
    private long age;

    /** The salary. */
    private Double salary;

    /**
     * Gets the person id.
     * 
     * @return the person id
     */
    public String getPersonId()
    {
        return personId;
    }

    /**
     * Sets the person id.
     * 
     * @param personId
     *            the new person id
     */
    public void setPersonId(String personId)
    {
        this.personId = personId;
    }

    /**
     * Gets the person name.
     * 
     * @return the person name
     */
    public String getPersonName()
    {
        return personName;
    }

    /**
     * Sets the person name.
     * 
     * @param personName
     *            the new person name
     */
    public void setPersonName(String personName)
    {
        this.personName = personName;
    }

    /**
     * Gets the age.
     * 
     * @return the age
     */
    public long getAge()
    {
        return age;
    }

    /**
     * Sets the age.
     * 
     * @param age
     *            the new age
     */
    public void setAge(long age)
    {
        this.age = age;
    }

    /**
     * Gets the salary.
     * 
     * @return the salary
     */
    public Double getSalary()
    {
        return salary;
    }

    /**
     * Sets the salary.
     * 
     * @param salary
     *            the new salary
     */
    public void setSalary(Double salary)
    {
        this.salary = salary;
    }

}
