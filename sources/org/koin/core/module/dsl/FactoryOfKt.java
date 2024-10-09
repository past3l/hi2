package org.koin.core.module.dsl;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;

/* compiled from: FactoryOf.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a]\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001ak\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001*\u00020\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00020\u00072-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001ay\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001*\u00020\u00032\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u00020\u000e2-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a\u0087\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001*\u00020\u00032 \b\u0004\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u00020\u00102-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a\u0095\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001*\u00020\u00032&\b\u0004\u0010\u0004\u001a \u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u00020\u00122-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a£\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001*\u00020\u00032,\b\u0004\u0010\u0004\u001a&\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00020\u00142-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a±\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001*\u00020\u000322\b\u0004\u0010\u0004\u001a,\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u00020\u00162-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a¿\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001*\u00020\u000328\b\u0004\u0010\u0004\u001a2\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u00020\u00182-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001aÍ\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001*\u00020\u00032>\b\u0004\u0010\u0004\u001a8\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u00020\u001a2-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001aÛ\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001*\u00020\u00032D\b\u0004\u0010\u0004\u001a>\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u00020\u001c2-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001aé\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001*\u00020\u00032J\b\u0004\u0010\u0004\u001aD\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u00020\u001e2-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a÷\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001\"\u0006\b\u000b\u0010\u001f\u0018\u0001*\u00020\u00032P\b\u0004\u0010\u0004\u001aJ\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H\u00020 2-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a\u0085\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001\"\u0006\b\u000b\u0010\u001f\u0018\u0001\"\u0006\b\f\u0010!\u0018\u0001*\u00020\u00032V\b\u0004\u0010\u0004\u001aP\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H\u00020\"2-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a\u0093\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001\"\u0006\b\u000b\u0010\u001f\u0018\u0001\"\u0006\b\f\u0010!\u0018\u0001\"\u0006\b\r\u0010#\u0018\u0001*\u00020\u00032\\\b\u0004\u0010\u0004\u001aV\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H\u00020$2-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a¡\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001\"\u0006\b\u000b\u0010\u001f\u0018\u0001\"\u0006\b\f\u0010!\u0018\u0001\"\u0006\b\r\u0010#\u0018\u0001\"\u0006\b\u000e\u0010%\u0018\u0001*\u00020\u00032b\b\u0004\u0010\u0004\u001a\\\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H\u00020&2-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a¯\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001\"\u0006\b\u000b\u0010\u001f\u0018\u0001\"\u0006\b\f\u0010!\u0018\u0001\"\u0006\b\r\u0010#\u0018\u0001\"\u0006\b\u000e\u0010%\u0018\u0001\"\u0006\b\u000f\u0010'\u0018\u0001*\u00020\u00032h\b\u0004\u0010\u0004\u001ab\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H'\u0012\u0004\u0012\u0002H\u00020(2-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a½\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001\"\u0006\b\u000b\u0010\u001f\u0018\u0001\"\u0006\b\f\u0010!\u0018\u0001\"\u0006\b\r\u0010#\u0018\u0001\"\u0006\b\u000e\u0010%\u0018\u0001\"\u0006\b\u000f\u0010'\u0018\u0001\"\u0006\b\u0010\u0010)\u0018\u0001*\u00020\u00032n\b\u0004\u0010\u0004\u001ah\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H'\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002H\u00020*2-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001aË\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001\"\u0006\b\u000b\u0010\u001f\u0018\u0001\"\u0006\b\f\u0010!\u0018\u0001\"\u0006\b\r\u0010#\u0018\u0001\"\u0006\b\u000e\u0010%\u0018\u0001\"\u0006\b\u000f\u0010'\u0018\u0001\"\u0006\b\u0010\u0010)\u0018\u0001\"\u0006\b\u0011\u0010+\u0018\u0001*\u00020\u00032t\b\u0004\u0010\u0004\u001an\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H'\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002H+\u0012\u0004\u0012\u0002H\u00020,2-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001aÙ\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001\"\u0006\b\u000b\u0010\u001f\u0018\u0001\"\u0006\b\f\u0010!\u0018\u0001\"\u0006\b\r\u0010#\u0018\u0001\"\u0006\b\u000e\u0010%\u0018\u0001\"\u0006\b\u000f\u0010'\u0018\u0001\"\u0006\b\u0010\u0010)\u0018\u0001\"\u0006\b\u0011\u0010+\u0018\u0001\"\u0006\b\u0012\u0010-\u0018\u0001*\u00020\u00032z\b\u0004\u0010\u0004\u001at\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H'\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002H+\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u0002H\u00020.2-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001aè\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001\"\u0006\b\u000b\u0010\u001f\u0018\u0001\"\u0006\b\f\u0010!\u0018\u0001\"\u0006\b\r\u0010#\u0018\u0001\"\u0006\b\u000e\u0010%\u0018\u0001\"\u0006\b\u000f\u0010'\u0018\u0001\"\u0006\b\u0010\u0010)\u0018\u0001\"\u0006\b\u0011\u0010+\u0018\u0001\"\u0006\b\u0012\u0010-\u0018\u0001\"\u0006\b\u0013\u0010/\u0018\u0001*\u00020\u00032\u0080\u0001\b\u0004\u0010\u0004\u001az\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H'\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002H+\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u0002H/\u0012\u0004\u0012\u0002H\u0002002-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a÷\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001\"\u0006\b\u000b\u0010\u001f\u0018\u0001\"\u0006\b\f\u0010!\u0018\u0001\"\u0006\b\r\u0010#\u0018\u0001\"\u0006\b\u000e\u0010%\u0018\u0001\"\u0006\b\u000f\u0010'\u0018\u0001\"\u0006\b\u0010\u0010)\u0018\u0001\"\u0006\b\u0011\u0010+\u0018\u0001\"\u0006\b\u0012\u0010-\u0018\u0001\"\u0006\b\u0013\u0010/\u0018\u0001\"\u0006\b\u0014\u00101\u0018\u0001*\u00020\u00032\u0087\u0001\b\u0004\u0010\u0004\u001a\u0080\u0001\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H'\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002H+\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u0002H/\u0012\u0004\u0012\u0002H1\u0012\u0004\u0012\u0002H\u0002022-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a\u0085\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001\"\u0006\b\u000b\u0010\u001f\u0018\u0001\"\u0006\b\f\u0010!\u0018\u0001\"\u0006\b\r\u0010#\u0018\u0001\"\u0006\b\u000e\u0010%\u0018\u0001\"\u0006\b\u000f\u0010'\u0018\u0001\"\u0006\b\u0010\u0010)\u0018\u0001\"\u0006\b\u0011\u0010+\u0018\u0001\"\u0006\b\u0012\u0010-\u0018\u0001\"\u0006\b\u0013\u0010/\u0018\u0001\"\u0006\b\u0014\u00101\u0018\u0001\"\u0006\b\u0015\u00103\u0018\u0001*\u00020\u00032\u008d\u0001\b\u0004\u0010\u0004\u001a\u0086\u0001\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H'\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002H+\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u0002H/\u0012\u0004\u0012\u0002H1\u0012\u0004\u0012\u0002H3\u0012\u0004\u0012\u0002H\u0002042-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a\u0093\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001\"\u0006\b\u000b\u0010\u001f\u0018\u0001\"\u0006\b\f\u0010!\u0018\u0001\"\u0006\b\r\u0010#\u0018\u0001\"\u0006\b\u000e\u0010%\u0018\u0001\"\u0006\b\u000f\u0010'\u0018\u0001\"\u0006\b\u0010\u0010)\u0018\u0001\"\u0006\b\u0011\u0010+\u0018\u0001\"\u0006\b\u0012\u0010-\u0018\u0001\"\u0006\b\u0013\u0010/\u0018\u0001\"\u0006\b\u0014\u00101\u0018\u0001\"\u0006\b\u0015\u00103\u0018\u0001\"\u0006\b\u0016\u00105\u0018\u0001*\u00020\u00032\u0093\u0001\b\u0004\u0010\u0004\u001a\u008c\u0001\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H'\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002H+\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u0002H/\u0012\u0004\u0012\u0002H1\u0012\u0004\u0012\u0002H3\u0012\u0004\u0012\u0002H5\u0012\u0004\u0012\u0002H\u0002062-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00067"}, d2 = {"factoryOf", "Lorg/koin/core/definition/KoinDefinition;", "R", "Lorg/koin/core/module/Module;", "constructor", "Lkotlin/Function0;", "options", "Lkotlin/Function1;", "Lorg/koin/core/definition/BeanDefinition;", "", "Lorg/koin/core/module/dsl/DefinitionOptions;", "Lkotlin/ExtensionFunctionType;", "T1", "T2", "Lkotlin/Function2;", "T3", "Lkotlin/Function3;", "T4", "Lkotlin/Function4;", "T5", "Lkotlin/Function5;", "T6", "Lkotlin/Function6;", "T7", "Lkotlin/Function7;", "T8", "Lkotlin/Function8;", "T9", "Lkotlin/Function9;", "T10", "Lkotlin/Function10;", "T11", "Lkotlin/Function11;", "T12", "Lkotlin/Function12;", "T13", "Lkotlin/Function13;", "T14", "Lkotlin/Function14;", "T15", "Lkotlin/Function15;", "T16", "Lkotlin/Function16;", "T17", "Lkotlin/Function17;", "T18", "Lkotlin/Function18;", "T19", "Lkotlin/Function19;", "T20", "Lkotlin/Function20;", "T21", "Lkotlin/Function21;", "T22", "Lkotlin/Function22;", "koin-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FactoryOfKt {
    public static /* synthetic */ KoinDefinition factoryOf$default(Module module, Function0 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$1 factoryOfKt$factoryOf$1 = new FactoryOfKt$factoryOf$1(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$1, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R> KoinDefinition<R> factoryOf(Module module, Function0<? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$1 factoryOfKt$factoryOf$1 = new FactoryOfKt$factoryOf$1(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$1, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(Module module, Function1 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$2 factoryOfKt$factoryOf$2 = new FactoryOfKt$factoryOf$2(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$2, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1> KoinDefinition<R> factoryOf(Module module, Function1<? super T1, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$2 factoryOfKt$factoryOf$2 = new FactoryOfKt$factoryOf$2(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$2, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(Module module, Function2 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$3 factoryOfKt$factoryOf$3 = new FactoryOfKt$factoryOf$3(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$3, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2> KoinDefinition<R> factoryOf(Module module, Function2<? super T1, ? super T2, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$3 factoryOfKt$factoryOf$3 = new FactoryOfKt$factoryOf$3(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$3, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(Module module, Function3 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$4 factoryOfKt$factoryOf$4 = new FactoryOfKt$factoryOf$4(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$4, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3> KoinDefinition<R> factoryOf(Module module, Function3<? super T1, ? super T2, ? super T3, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$4 factoryOfKt$factoryOf$4 = new FactoryOfKt$factoryOf$4(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$4, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(Module module, Function4 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$5 factoryOfKt$factoryOf$5 = new FactoryOfKt$factoryOf$5(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$5, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4> KoinDefinition<R> factoryOf(Module module, Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$5 factoryOfKt$factoryOf$5 = new FactoryOfKt$factoryOf$5(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$5, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(Module module, Function5 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$6 factoryOfKt$factoryOf$6 = new FactoryOfKt$factoryOf$6(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$6, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5> KoinDefinition<R> factoryOf(Module module, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$6 factoryOfKt$factoryOf$6 = new FactoryOfKt$factoryOf$6(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$6, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(Module module, Function6 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$7 factoryOfKt$factoryOf$7 = new FactoryOfKt$factoryOf$7(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$7, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6> KoinDefinition<R> factoryOf(Module module, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$7 factoryOfKt$factoryOf$7 = new FactoryOfKt$factoryOf$7(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$7, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(Module module, Function7 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$8 factoryOfKt$factoryOf$8 = new FactoryOfKt$factoryOf$8(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$8, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7> KoinDefinition<R> factoryOf(Module module, Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$8 factoryOfKt$factoryOf$8 = new FactoryOfKt$factoryOf$8(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$8, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(Module module, Function8 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$9 factoryOfKt$factoryOf$9 = new FactoryOfKt$factoryOf$9(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$9, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8> KoinDefinition<R> factoryOf(Module module, Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$9 factoryOfKt$factoryOf$9 = new FactoryOfKt$factoryOf$9(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$9, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(Module module, Function9 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$10 factoryOfKt$factoryOf$10 = new FactoryOfKt$factoryOf$10(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$10, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9> KoinDefinition<R> factoryOf(Module module, Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$10 factoryOfKt$factoryOf$10 = new FactoryOfKt$factoryOf$10(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$10, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(Module module, Function10 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$11 factoryOfKt$factoryOf$11 = new FactoryOfKt$factoryOf$11(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$11, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> KoinDefinition<R> factoryOf(Module module, Function10<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$11 factoryOfKt$factoryOf$11 = new FactoryOfKt$factoryOf$11(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$11, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(Module module, Function11 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$12 factoryOfKt$factoryOf$12 = new FactoryOfKt$factoryOf$12(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$12, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> KoinDefinition<R> factoryOf(Module module, Function11<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$12 factoryOfKt$factoryOf$12 = new FactoryOfKt$factoryOf$12(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$12, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(Module module, Function12 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$13 factoryOfKt$factoryOf$13 = new FactoryOfKt$factoryOf$13(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$13, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> KoinDefinition<R> factoryOf(Module module, Function12<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$13 factoryOfKt$factoryOf$13 = new FactoryOfKt$factoryOf$13(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$13, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(Module module, Function13 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$14 factoryOfKt$factoryOf$14 = new FactoryOfKt$factoryOf$14(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$14, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> KoinDefinition<R> factoryOf(Module module, Function13<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$14 factoryOfKt$factoryOf$14 = new FactoryOfKt$factoryOf$14(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$14, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(Module module, Function14 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$15 factoryOfKt$factoryOf$15 = new FactoryOfKt$factoryOf$15(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$15, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> KoinDefinition<R> factoryOf(Module module, Function14<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$15 factoryOfKt$factoryOf$15 = new FactoryOfKt$factoryOf$15(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$15, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(Module module, Function15 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$16 factoryOfKt$factoryOf$16 = new FactoryOfKt$factoryOf$16(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$16, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> KoinDefinition<R> factoryOf(Module module, Function15<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$16 factoryOfKt$factoryOf$16 = new FactoryOfKt$factoryOf$16(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$16, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(Module module, Function16 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$17 factoryOfKt$factoryOf$17 = new FactoryOfKt$factoryOf$17(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$17, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> KoinDefinition<R> factoryOf(Module module, Function16<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$17 factoryOfKt$factoryOf$17 = new FactoryOfKt$factoryOf$17(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$17, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(Module module, Function17 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$18 factoryOfKt$factoryOf$18 = new FactoryOfKt$factoryOf$18(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$18, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> KoinDefinition<R> factoryOf(Module module, Function17<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$18 factoryOfKt$factoryOf$18 = new FactoryOfKt$factoryOf$18(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$18, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(Module module, Function18 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$19 factoryOfKt$factoryOf$19 = new FactoryOfKt$factoryOf$19(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$19, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> KoinDefinition<R> factoryOf(Module module, Function18<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$19 factoryOfKt$factoryOf$19 = new FactoryOfKt$factoryOf$19(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$19, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(Module module, Function19 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$20 factoryOfKt$factoryOf$20 = new FactoryOfKt$factoryOf$20(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$20, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> KoinDefinition<R> factoryOf(Module module, Function19<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$20 factoryOfKt$factoryOf$20 = new FactoryOfKt$factoryOf$20(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$20, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(Module module, Function20 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$21 factoryOfKt$factoryOf$21 = new FactoryOfKt$factoryOf$21(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$21, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> KoinDefinition<R> factoryOf(Module module, Function20<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$21 factoryOfKt$factoryOf$21 = new FactoryOfKt$factoryOf$21(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$21, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(Module module, Function21 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$22 factoryOfKt$factoryOf$22 = new FactoryOfKt$factoryOf$22(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$22, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> KoinDefinition<R> factoryOf(Module module, Function21<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$22 factoryOfKt$factoryOf$22 = new FactoryOfKt$factoryOf$22(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$22, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(Module module, Function22 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$23 factoryOfKt$factoryOf$23 = new FactoryOfKt$factoryOf$23(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$23, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> KoinDefinition<R> factoryOf(Module module, Function22<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? super T22, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        FactoryOfKt$factoryOf$23 factoryOfKt$factoryOf$23 = new FactoryOfKt$factoryOf$23(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List emptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, factoryOfKt$factoryOf$23, kind, emptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }
}
