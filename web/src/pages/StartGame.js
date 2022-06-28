import React from 'react'
import { Button, Grid, Stack } from '@mui/material';
import TextField from '@mui/material/TextField';

const StartGame = () => {

  const handleSubmit = (event) => {
      console.log("Start Game clicked!")
  }
  
  return (
    <Grid
      container
      spacing={0}
      direction="column"
      alignItems="center"
      justifyContent="center"
      style={{ minHeight: '100vh' }}>
      <Grid item xs={3}>
        <Stack
          component="form"
          onSubmit={handleSubmit}
          sx={{width: '30ch'}}
          spacing={2}
          >
            <TextField name="firstPlayerName" label="Player 1 Name" />
            <TextField name="secondPlayerName" label="Player 2 Name" />
            <Button variant="contained" type="submit">Start Game</Button>
        </Stack>
      </Grid>
    </Grid>
  )
}

export default StartGame