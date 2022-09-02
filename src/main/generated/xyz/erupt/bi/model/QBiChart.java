package xyz.erupt.bi.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBiChart is a Querydsl query type for BiChart
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBiChart extends EntityPathBase<BiChart> {

    private static final long serialVersionUID = -1477795646L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBiChart biChart = new QBiChart("biChart");

    public final xyz.erupt.jpa.model.QMetaModelUpdateVo _super = new xyz.erupt.jpa.model.QMetaModelUpdateVo(this);

    public final QBi bi;

    public final QBiTpl biTpl;

    public final NumberPath<Integer> cacheTime = createNumber("cacheTime", Integer.class);

    public final StringPath chartOption = createString("chartOption");

    public final QBiClassHandler classHandler;

    public final StringPath code = createString("code");

    //inherited
    public final StringPath createBy = _super.createBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createTime = _super.createTime;

    public final QBiDataSource dataSource;

    public final NumberPath<Integer> grid = createNumber("grid", Integer.class);

    public final NumberPath<Integer> height = createNumber("height", Integer.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public final NumberPath<Integer> sort = createNumber("sort", Integer.class);

    public final StringPath sqlStatement = createString("sqlStatement");

    public final StringPath type = createString("type");

    //inherited
    public final StringPath updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateTime = _super.updateTime;

    public QBiChart(String variable) {
        this(BiChart.class, forVariable(variable), INITS);
    }

    public QBiChart(Path<? extends BiChart> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBiChart(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBiChart(PathMetadata metadata, PathInits inits) {
        this(BiChart.class, metadata, inits);
    }

    public QBiChart(Class<? extends BiChart> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.bi = inits.isInitialized("bi") ? new QBi(forProperty("bi"), inits.get("bi")) : null;
        this.biTpl = inits.isInitialized("biTpl") ? new QBiTpl(forProperty("biTpl")) : null;
        this.classHandler = inits.isInitialized("classHandler") ? new QBiClassHandler(forProperty("classHandler")) : null;
        this.dataSource = inits.isInitialized("dataSource") ? new QBiDataSource(forProperty("dataSource")) : null;
    }

}

