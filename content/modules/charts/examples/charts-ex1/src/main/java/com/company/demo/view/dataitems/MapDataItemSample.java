package com.company.demo.view.dataitems;

import io.jmix.chartsflowui.component.Chart;
import io.jmix.chartsflowui.data.item.MapDataItem;
import io.jmix.chartsflowui.kit.component.model.DataSet;
import io.jmix.chartsflowui.kit.data.chart.ListChartItems;
import io.jmix.flowui.view.*;

import java.util.List;
import java.util.Map;

@ViewController("map-data-item")
@ViewDescriptor("map-data-item.xml")
public class MapDataItemSample extends StandardView {

    // tag::onInit[]
    @ViewComponent
    protected Chart chart;

    @Subscribe
    protected void onInit(InitEvent event) {
        ListChartItems<MapDataItem> chartItems = new ListChartItems<>(
                List.of(
                        new MapDataItem(Map.of("value", 75, "description", "Sky")),
                        new MapDataItem(Map.of("value", 7, "description", "Shady side of pyramid")),
                        new MapDataItem(Map.of("value", 18, "description", "Sunny side of pyramid"))
                )
        );

        chart.withDataSet(
                new DataSet().withSource(
                        new DataSet.Source<MapDataItem>()
                                .withDataProvider(chartItems)
                                .withCategoryField("description")
                                .withValueField("value")
                )
        );
    }
    // end::onInit[]
}
