package com.fudan.se.community.controller.response;

import com.fudan.se.community.pojo.vm.Task;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PTasksMapResponse {
    List<Task> result;
}
