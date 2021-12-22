/*
 * This file is generated by jOOQ.
 */
package edu.uoc.hagendazs.generated.jooq.tables.records


import edu.uoc.hagendazs.generated.jooq.tables.Event

import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record8
import org.jooq.Row8
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class EventRecord() : UpdatableRecordImpl<EventRecord>(Event.EVENT), Record8<String?, String?, String?, String?, LocalDateTime?, LocalDateTime?, String?, String?> {

    var id: String?
        set(value) = set(0, value)
        get() = get(0) as String?

    var name: String?
        set(value) = set(1, value)
        get() = get(1) as String?

    var description: String?
        set(value) = set(2, value)
        get() = get(2) as String?

    var headerImage: String?
        set(value) = set(3, value)
        get() = get(3) as String?

    var startDate: LocalDateTime?
        set(value) = set(4, value)
        get() = get(4) as LocalDateTime?

    var endDate: LocalDateTime?
        set(value) = set(5, value)
        get() = get(5) as LocalDateTime?

    var organizerId: String?
        set(value) = set(6, value)
        get() = get(6) as String?

    var categoryId: String?
        set(value) = set(7, value)
        get() = get(7) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row8<String?, String?, String?, String?, LocalDateTime?, LocalDateTime?, String?, String?> = super.fieldsRow() as Row8<String?, String?, String?, String?, LocalDateTime?, LocalDateTime?, String?, String?>
    override fun valuesRow(): Row8<String?, String?, String?, String?, LocalDateTime?, LocalDateTime?, String?, String?> = super.valuesRow() as Row8<String?, String?, String?, String?, LocalDateTime?, LocalDateTime?, String?, String?>
    override fun field1(): Field<String?> = Event.EVENT.ID
    override fun field2(): Field<String?> = Event.EVENT.NAME
    override fun field3(): Field<String?> = Event.EVENT.DESCRIPTION
    override fun field4(): Field<String?> = Event.EVENT.HEADER_IMAGE
    override fun field5(): Field<LocalDateTime?> = Event.EVENT.START_DATE
    override fun field6(): Field<LocalDateTime?> = Event.EVENT.END_DATE
    override fun field7(): Field<String?> = Event.EVENT.ORGANIZER_ID
    override fun field8(): Field<String?> = Event.EVENT.CATEGORY_ID
    override fun component1(): String? = id
    override fun component2(): String? = name
    override fun component3(): String? = description
    override fun component4(): String? = headerImage
    override fun component5(): LocalDateTime? = startDate
    override fun component6(): LocalDateTime? = endDate
    override fun component7(): String? = organizerId
    override fun component8(): String? = categoryId
    override fun value1(): String? = id
    override fun value2(): String? = name
    override fun value3(): String? = description
    override fun value4(): String? = headerImage
    override fun value5(): LocalDateTime? = startDate
    override fun value6(): LocalDateTime? = endDate
    override fun value7(): String? = organizerId
    override fun value8(): String? = categoryId

    override fun value1(value: String?): EventRecord {
        this.id = value
        return this
    }

    override fun value2(value: String?): EventRecord {
        this.name = value
        return this
    }

    override fun value3(value: String?): EventRecord {
        this.description = value
        return this
    }

    override fun value4(value: String?): EventRecord {
        this.headerImage = value
        return this
    }

    override fun value5(value: LocalDateTime?): EventRecord {
        this.startDate = value
        return this
    }

    override fun value6(value: LocalDateTime?): EventRecord {
        this.endDate = value
        return this
    }

    override fun value7(value: String?): EventRecord {
        this.organizerId = value
        return this
    }

    override fun value8(value: String?): EventRecord {
        this.categoryId = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: String?, value5: LocalDateTime?, value6: LocalDateTime?, value7: String?, value8: String?): EventRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        this.value8(value8)
        return this
    }

    /**
     * Create a detached, initialised EventRecord
     */
    constructor(id: String? = null, name: String? = null, description: String? = null, headerImage: String? = null, startDate: LocalDateTime? = null, endDate: LocalDateTime? = null, organizerId: String? = null, categoryId: String? = null): this() {
        this.id = id
        this.name = name
        this.description = description
        this.headerImage = headerImage
        this.startDate = startDate
        this.endDate = endDate
        this.organizerId = organizerId
        this.categoryId = categoryId
    }
}
