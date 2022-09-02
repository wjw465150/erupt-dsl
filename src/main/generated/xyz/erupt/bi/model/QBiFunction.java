package xyz.erupt.bi.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBiFunction is a Querydsl query type for BiFunction
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBiFunction extends EntityPathBase<BiFunction> {

    private static final long serialVersionUID = -1650765708L;

    public static final QBiFunction biFunction = new QBiFunction("biFunction");

    public final xyz.erupt.jpa.model.QMetaModelUpdateVo _super = new xyz.erupt.jpa.model.QMetaModelUpdateVo(this);

    public final StringPath code = createString("code");

    //inherited
    public final StringPath createBy = _super.createBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createTime = _super.createTime;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath jsFunction = createString("jsFunction");

    public final StringPath name = createString("name");

    //inherited
    public final StringPath updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateTime = _super.updateTime;

    public QBiFunction(String variable) {
        super(BiFunction.class, forVariable(variable));
    }

    public QBiFunction(Path<? extends BiFunction> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBiFunction(PathMetadata metadata) {
        super(BiFunction.class, metadata);
    }

}

