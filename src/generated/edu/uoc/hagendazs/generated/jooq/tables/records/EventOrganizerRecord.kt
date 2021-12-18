/*
 * This file is generated by jOOQ.
 */
package edu.uoc.hagendazs.generated.jooq.tables.records


import edu.uoc.hagendazs.generated.jooq.tables.EventOrganizer

import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record5
import org.jooq.Row5
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class EventOrganizerRecord() : UpdatableRecordImpl<EventOrganizerRecord>(EventOrganizer.EVENT_ORGANIZER), Record5<String?, String?, String?, String?, LocalDateTime?> {

    var id: String?
        set(value) = set(0, value)
        get() = get(0) as String?

    var name: String?
        set(value) = set(1, value)
        get() = get(1) as String?

    var description: String?
        set(value) = set(2, value)
        get() = get(2) as String?

    var admin: String?
        set(value) = set(3, value)
        get() = get(3) as String?

    var createdAt: LocalDateTime?
        set(value) = set(4, value)
        get() = get(4) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row5<String?, String?, String?, String?, LocalDateTime?> = super.fieldsRow() as Row5<String?, String?, String?, String?, LocalDateTime?>
    override fun valuesRow(): Row5<String?, String?, String?, String?, LocalDateTime?> = super.valuesRow() as Row5<String?, String?, String?, String?, LocalDateTime?>
    override fun field1(): Field<String?> = EventOrganizer.EVENT_ORGANIZER.ID
    override fun field2(): Field<String?> = EventOrganizer.EVENT_ORGANIZER.NAME
    override fun field3(): Field<String?> = EventOrganizer.EVENT_ORGANIZER.DESCRIPTION
    override fun field4(): Field<String?> = EventOrganizer.EVENT_ORGANIZER.ADMIN
    override fun field5(): Field<LocalDateTime?> = EventOrganizer.EVENT_ORGANIZER.CREATED_AT
    override fun component1(): String? = id
    override fun component2(): String? = name
    override fun component3(): String? = description
    override fun component4(): String? = admin
    override fun component5(): LocalDateTime? = createdAt
    override fun value1(): String? = id
    override fun value2(): String? = name
    override fun value3(): String? = description
    override fun value4(): String? = admin
    override fun value5(): LocalDateTime? = createdAt

    override fun value1(value: String?): EventOrganizerRecord {
        this.id = value
        return this
    }

    override fun value2(value: String?): EventOrganizerRecord {
        this.name = value
        return this
    }

    override fun value3(value: String?): EventOrganizerRecord {
        this.description = value
        return this
    }

    override fun value4(value: String?): EventOrganizerRecord {
        this.admin = value
        return this
    }

    override fun value5(value: LocalDateTime?): EventOrganizerRecord {
        this.createdAt = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: String?, value5: LocalDateTime?): EventOrganizerRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        return this
    }

    /**
     * Create a detached, initialised EventOrganizerRecord
     */
    constructor(id: String? = null, name: String? = null, description: String? = null, admin: String? = null, createdAt: LocalDateTime? = null): this() {
        this.id = id
        this.name = name
        this.description = description
        this.admin = admin
        this.createdAt = createdAt
    }
}