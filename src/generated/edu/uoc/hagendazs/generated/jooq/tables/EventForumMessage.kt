/*
 * This file is generated by jOOQ.
 */
package edu.uoc.hagendazs.generated.jooq.tables


import edu.uoc.hagendazs.generated.jooq.Public
import edu.uoc.hagendazs.generated.jooq.keys.EVENT_FORUM_MESSAGE_PKEY
import edu.uoc.hagendazs.generated.jooq.keys.EVENT_FORUM_MESSAGE__FK_FORUM_AUTHOR
import edu.uoc.hagendazs.generated.jooq.keys.EVENT_FORUM_MESSAGE__FK_FORUM_EVENT_ID
import edu.uoc.hagendazs.generated.jooq.keys.EVENT_FORUM_MESSAGE__FK_PARENT_COMMENT
import edu.uoc.hagendazs.generated.jooq.tables.records.EventForumMessageRecord

import java.time.LocalDateTime

import kotlin.collections.List

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row6
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class EventForumMessage(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, EventForumMessageRecord>?,
    aliased: Table<EventForumMessageRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<EventForumMessageRecord>(
    alias,
    Public.PUBLIC,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>public.event_forum_message</code>
         */
        val EVENT_FORUM_MESSAGE = EventForumMessage()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<EventForumMessageRecord> = EventForumMessageRecord::class.java

    /**
     * The column <code>public.event_forum_message.id</code>.
     */
    val ID: TableField<EventForumMessageRecord, String?> = createField(DSL.name("id"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>public.event_forum_message.author_user_id</code>.
     */
    val AUTHOR_USER_ID: TableField<EventForumMessageRecord, String?> = createField(DSL.name("author_user_id"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>public.event_forum_message.event_id</code>.
     */
    val EVENT_ID: TableField<EventForumMessageRecord, String?> = createField(DSL.name("event_id"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>public.event_forum_message.parent_id</code>.
     */
    val PARENT_ID: TableField<EventForumMessageRecord, String?> = createField(DSL.name("parent_id"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>public.event_forum_message.created_at</code>.
     */
    val CREATED_AT: TableField<EventForumMessageRecord, LocalDateTime?> = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "")

    /**
     * The column <code>public.event_forum_message.message</code>.
     */
    val MESSAGE: TableField<EventForumMessageRecord, String?> = createField(DSL.name("message"), SQLDataType.VARCHAR.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<EventForumMessageRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<EventForumMessageRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.event_forum_message</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.event_forum_message</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.event_forum_message</code> table reference
     */
    constructor(): this(DSL.name("event_forum_message"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, EventForumMessageRecord>): this(Internal.createPathAlias(child, key), child, key, EVENT_FORUM_MESSAGE, null)
    override fun getSchema(): Schema = Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<EventForumMessageRecord> = EVENT_FORUM_MESSAGE_PKEY
    override fun getKeys(): List<UniqueKey<EventForumMessageRecord>> = listOf(EVENT_FORUM_MESSAGE_PKEY)
    override fun getReferences(): List<ForeignKey<EventForumMessageRecord, *>> = listOf(EVENT_FORUM_MESSAGE__FK_FORUM_AUTHOR, EVENT_FORUM_MESSAGE__FK_FORUM_EVENT_ID, EVENT_FORUM_MESSAGE__FK_PARENT_COMMENT)

    private lateinit var _user: User
    private lateinit var _event: Event
    private lateinit var _eventForumMessage: EventForumMessage
    fun user(): User {
        if (!this::_user.isInitialized)
            _user = User(this, EVENT_FORUM_MESSAGE__FK_FORUM_AUTHOR)

        return _user;
    }
    fun event(): Event {
        if (!this::_event.isInitialized)
            _event = Event(this, EVENT_FORUM_MESSAGE__FK_FORUM_EVENT_ID)

        return _event;
    }
    fun eventForumMessage(): EventForumMessage {
        if (!this::_eventForumMessage.isInitialized)
            _eventForumMessage = EventForumMessage(this, EVENT_FORUM_MESSAGE__FK_PARENT_COMMENT)

        return _eventForumMessage;
    }
    override fun `as`(alias: String): EventForumMessage = EventForumMessage(DSL.name(alias), this)
    override fun `as`(alias: Name): EventForumMessage = EventForumMessage(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): EventForumMessage = EventForumMessage(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): EventForumMessage = EventForumMessage(name, null)

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row6<String?, String?, String?, String?, LocalDateTime?, String?> = super.fieldsRow() as Row6<String?, String?, String?, String?, LocalDateTime?, String?>
}
