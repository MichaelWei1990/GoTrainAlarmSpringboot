package com.MichaelWei.GoTrainAlarmServer.Mapper;

import com.MichaelWei.GoTrainAlarmServer.Bean.Stop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StopMapper {

    List<Stop> getAll();
    List<String> selectByVagueName(@Param("NAME")String name);

}
