package com.techrevolution.algorithms.veryhard.sortmapbykey;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created By Hemang Dave
 * Date: 15/09/22
 * Time: 2:57 pm
 */
@NoArgsConstructor
@Setter
@Getter
@Builder
@AllArgsConstructor
public class Result {
    private String english;
    private String math;
    private String science;

    @Override
    public String toString() {
        return "Result{" +
                "english='" + english + '\'' +
                ", math='" + math + '\'' +
                ", science='" + science + '\'' +
                '}';
    }
}
