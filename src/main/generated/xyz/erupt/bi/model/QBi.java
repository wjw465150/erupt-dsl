package xyz.erupt.bi.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBi is a Querydsl query type for Bi
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBi extends EntityPathBase<Bi> {

    private static final long serialVersionUID = 121615484L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBi bi = new QBi("bi");

    public final xyz.erupt.jpa.model.QMetaModelUpdateVo _super = new xyz.erupt.jpa.model.QMetaModelUpdateVo(this);

    public final SetPath<BiChart, QBiChart> biCharts = this.<BiChart, QBiChart>createSet("biCharts", BiChart.class, QBiChart.class, PathInits.DIRECT2);

    public final SetPath<BiColumn, QBiColumn> biColumns = this.<BiColumn, QBiColumn>createSet("biColumns", BiColumn.class, QBiColumn.class, PathInits.DIRECT2);

    public final SetPath<BiDimension, QBiDimension> biDimension = this.<BiDimension, QBiDimension>createSet("biDimension", BiDimension.class, QBiDimension.class, PathInits.DIRECT2);

    public final QBiGroup biGroup;

    public final NumberPath<Integer> cacheTime = createNumber("cacheTime", Integer.class);

    public final QBiClassHandler classHandler;

    public final StringPath code = createString("code");

    //inherited
    public final StringPath createBy = _super.createBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createTime = _super.createTime;

    public final QBiDataSource dataSource;

    public final BooleanPath export = createBoolean("export");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public final StringPath pageType = createString("pageType");

    public final NumberPath<Integer> refreshTime = createNumber("refreshTime", Integer.class);

    public final StringPath sqlStatement = createString("sqlStatement");

    //inherited
    public final StringPath updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateTime = _super.updateTime;

    public QBi(String variable) {
        this(Bi.class, forVariable(variable), INITS);
    }

    public QBi(Path<? extends Bi> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBi(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBi(PathMetadata metadata, PathInits inits) {
        this(Bi.class, metadata, inits);
    }

    public QBi(Class<? extends Bi> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.biGroup = inits.isInitialized("biGroup") ? new QBiGroup(forProperty("biGroup"), inits.get("biGroup")) : null;
        this.classHandler = inits.isInitialized("classHandler") ? new QBiClassHandler(forProperty("classHandler")) : null;
        this.dataSource = inits.isInitialized("dataSource") ? new QBiDataSource(forProperty("dataSource")) : null;
    }

}

