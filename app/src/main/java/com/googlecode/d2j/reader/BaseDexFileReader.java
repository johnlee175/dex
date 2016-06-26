package com.googlecode.d2j.reader;

import java.util.List;

import com.googlecode.d2j.visitors.DexFileVisitor;

public interface BaseDexFileReader {

    void accept(DexFileVisitor dv);

    List<String> getClassNames();

    void accept(DexFileVisitor dv, int config);

    void accept(DexFileVisitor dv, int classIdx, int config);
}
