package xyz.erupt.bi.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBiColumn is a Querydsl query type for BiColumn
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBiColumn extends EntityPathBase<BiColumn> {

    private static final long serialVersionUID = 1439770354L;

    public static final QBiColumn biColumn = new QBiColumn("biColumn");

    public final xyz.erupt.jpa.model.QBaseModel _super = new xyz.erupt.jpa.model.QBaseModel(this);

    public final BooleanPath display = createBoolean("display");

    public final StringPath drillExpress = createString("drillExpress");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public final BooleanPath sortable = createBoolean("sortable");

    public final StringPath type = createString("type");

    public final NumberPath<Integer> width = createNumber("width", Integer.class);

    public QBiColumn(String variable) {
        super(BiColumn.class, forVariable(variable));
    }

    public QBiColumn(Path<? extends BiColumn> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBiColumn(PathMetadata metadata) {
        super(BiColumn.class, metadata);
    }

}

