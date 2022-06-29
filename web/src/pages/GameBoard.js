import { Button, ButtonGroup, Card, CardContent, Container, Grid, Typography } from '@mui/material'
import React, { useEffect, useState } from 'react'
import { fetchScore, recordScore } from '../api/Tennis';
import PlayerCard from '../components/PlayerCard';

const GameBoard = () => {
  const [score, setScore] = useState({})

  const getScore = async () => {
    const res = await fetchScore()
    setScore(res)
  }

  useEffect(() => {
    getScore()
  }, [])

  const scorePlayer1 = () => {
    recordScore('PLAYER1').then(() => getScore())
    .catch(err => alert(err))
  }

  const scorePlayer2 = () => {
    recordScore('PLAYER2').then(() => getScore())
    .catch(err => alert(err))
  }

  return (
    <Container maxWidth="sm">
        <Grid container spacing={2} marginTop={1}>
          <Grid item xs={12}>
              <Typography fontSize={34} textAlign='center'>Game Board</Typography>
          </Grid>
          
          <Grid item xs={6}>
            <Typography fontSize={24}>Record New Points</Typography>
          </Grid>
          <Grid item xs={6}>
            <ButtonGroup variant="outlined" aria-label="outlined button group">
              <Button onClick={scorePlayer1}>Player 1</Button>
              <Button onClick={scorePlayer2}>Player 2</Button>
            </ButtonGroup>
            <Typography fontSize={10} style={{color: '#777'}}>Click the above buttons to record new points</Typography>
          </Grid>

          <Grid item xs={12}>
            <Typography fontSize={24}>Result</Typography>
          </Grid>
          <Grid item xs={6}>
            <PlayerCard player={score?.firstPlayer}/>
          </Grid>
          <Grid item xs={6}>
            <PlayerCard player={score?.secondPlayer}/>
          </Grid>
          <Grid item xs={12}>
            <Card>
              <CardContent>
                  <Typography sx={{ fontSize: 14 }} color="text.secondary" gutterBottom>
                      Score
                  </Typography>
                  <Typography variant="h5" component="div">{score?.score}</Typography>
              </CardContent>
            </Card>
          </Grid>
        </Grid>
    </Container>
  )
}

export default GameBoard