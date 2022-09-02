package xyz.erupt.bi.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBiDataSource is a Querydsl query type for BiDataSource
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBiDataSource extends EntityPathBase<BiDataSource> {

    private static final long serialVersionUID = -207650303L;

    public static final QBiDataSource biDataSource = new QBiDataSource("biDataSource");

    public final xyz.erupt.jpa.model.QMetaModelUpdateVo _super = new xyz.erupt.jpa.model.QMetaModelUpdateVo(this);

    public final StringPath code = createString("code");

    //inherited
    public final StringPath createBy = _super.createBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createTime = _super.createTime;

    public final StringPath driver = createString("driver");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath limitSql = createString("limitSql");

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final StringPath poolConfig = createString("poolConfig");

    public final StringPath remark = createString("remark");

    public final StringPath type = createString("type");

    //inherited
    public final StringPath updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateTime = _super.updateTime;

    public final StringPath url = createString("url");

    public final StringPath userName = createString("userName");

    public QBiDataSource(String variable) {
        super(BiDataSource.class, forVariable(variable));
    }

    public QBiDataSource(Path<? extends BiDataSource> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBiDataSource(PathMetadata metadata) {
        super(BiDataSource.class, metadata);
    }

}

