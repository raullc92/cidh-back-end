/*
 * This file is generated by jOOQ.
 */
package edu.uoc.hagendazs.generated.jooq.tables


import edu.uoc.hagendazs.generated.jooq.Public
import edu.uoc.hagendazs.generated.jooq.keys.CATEGORY_NAME_KEY
import edu.uoc.hagendazs.generated.jooq.keys.CATEGORY_PKEY
import edu.uoc.hagendazs.generated.jooq.tables.records.CategoryRecord

import java.time.LocalDateTime

import kotlin.collections.List

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row4
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
open class Category(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, CategoryRecord>?,
    aliased: Table<CategoryRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<CategoryRecord>(
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
         * The reference instance of <code>public.category</code>
         */
        val CATEGORY = Category()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CategoryRecord> = CategoryRecord::class.java

    /**
     * The column <code>public.category.id</code>.
     */
    val ID: TableField<CategoryRecord, String?> = createField(DSL.name("id"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>public.category.name</code>.
     */
    val NAME: TableField<CategoryRecord, String?> = createField(DSL.name("name"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>public.category.description</code>.
     */
    val DESCRIPTION: TableField<CategoryRecord, String?> = createField(DSL.name("description"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>public.category.created_at</code>.
     */
    val CREATED_AT: TableField<CategoryRecord, LocalDateTime?> = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<CategoryRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<CategoryRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.category</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.category</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.category</code> table reference
     */
    constructor(): this(DSL.name("category"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, CategoryRecord>): this(Internal.createPathAlias(child, key), child, key, CATEGORY, null)
    override fun getSchema(): Schema = Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<CategoryRecord> = CATEGORY_PKEY
    override fun getKeys(): List<UniqueKey<CategoryRecord>> = listOf(CATEGORY_PKEY, CATEGORY_NAME_KEY)
    override fun `as`(alias: String): Category = Category(DSL.name(alias), this)
    override fun `as`(alias: Name): Category = Category(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Category = Category(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Category = Category(name, null)

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row4<String?, String?, String?, LocalDateTime?> = super.fieldsRow() as Row4<String?, String?, String?, LocalDateTime?>
}
