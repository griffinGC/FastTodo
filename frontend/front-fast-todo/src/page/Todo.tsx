import { Box, Button, Grid, Paper, Stack, TextField } from "@mui/material";
import React, { useEffect, useState } from "react";

const Todo = () => {
  const [inputData, setInputData] = useState();
  const [showAddBtn, setShowAddBtn] = useState(false);

  const showAddTodoBtn = () => {
    setShowAddBtn(true);
  };

  const saveTodo = () => {
    console.log("save clicked!");
    console.log("inputData : " + inputData);
  };

  const handleChange = (e: any) => {
    console.log("e : " + e.target.value);
    setInputData(e.target.value);
  };

  // 페이지 처음 랜더링 될때
  useEffect(() => {
    console.log("rendering page!!");
  }, []);

  return (
    <div>
      <Stack direction={"row"} spacing={2} justifyContent={"center"} m={2}>
        <h1>Todo</h1>
        <Box>
          <Button
            sx={{ marginTop: 3 }}
            variant="contained"
            onClick={showAddTodoBtn}
          >
            Add Todo
          </Button>
        </Box>
      </Stack>
      {showAddBtn ? (
        <Stack direction={"row"} spacing={2} justifyContent={"center"}>
          <TextField
            sx={{ width: 700 }}
            required
            id="new-todo"
            label="todo"
            variant="outlined"
            onChange={(e) => handleChange(e)}
          />
          <Button variant="contained" onClick={saveTodo}>
            추가
          </Button>
        </Stack>
      ) : (
        <div>none!</div>
      )}
    </div>
  );
};

export default Todo;
